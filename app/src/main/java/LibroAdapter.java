import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cl.telematica.basicconnectionexample.R;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolder> {
    private List<Libro> theBooks;

    public LibroAdapter(List<Libro> dataset) {
        this.theBooks = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        TextView mDescription;

        public ViewHolder(View v) {
            super(v);
            mTitle = v.findViewById(R.id.book_title);
            mDescription = v.findViewById(R.id.book_description);
        }
    }

    @Override
    public LibroAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_libro, parent);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LibroAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(theBooks.get(position).getNombre());
        holder.mDescription.setText(theBooks.get(position).getEditorial());
    }

    @Override
    public int getItemCount() {
        return theBooks.size();
    }
}
