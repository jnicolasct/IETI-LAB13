package co.edu.eci.ieti.android.ui.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.edu.eci.ieti.R;
import co.edu.eci.ieti.android.network.data.Task;

public class TasksAdapter
        extends RecyclerView.Adapter<TasksAdapter.ViewHolder>
{

    List<Task> taskList = null;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType )
    {
        return new ViewHolder( LayoutInflater.from( parent.getContext() ).inflate(R.layout.task_row, parent, false ) );
    }

    @Override
    public void onBindViewHolder( @NonNull ViewHolder holder, int position )
    {
        Task task = taskList.get( position );
        TextView description = holder.itemView.findViewById(R.id.DescripionTask);
        TextView priority = holder.itemView.findViewById(R.id.PriorityTask);
        TextView date = holder.itemView.findViewById(R.id.DateTask);
        description.setText(task.getDescription());
        priority.setText(task.getPriority());
        date.setText(task.getDueDate().toString());
    }//TODO implement update view holder using the task values

    @Override
    public int getItemCount()
    {
        return taskList != null ? taskList.size() : 0;
    }

    public void updateTasks(List<Task> tasks){
        this.taskList = tasks;
        //notifyDataSetChanged();
    }

    class ViewHolder
            extends RecyclerView.ViewHolder
    {
        ViewHolder( @NonNull View itemView )
        {
            super( itemView );
        }
    }

}
