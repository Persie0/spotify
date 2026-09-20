package p204p;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pcj extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public List f176136a;

    /* JADX INFO: renamed from: b */
    public final ocj f176137b;

    public pcj(Context context, List list) {
        super(context, R.layout.view_dropdown_item);
        this.f176136a = list;
        this.f176137b = new ocj(this, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f176136a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.f176137b;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (String) g6f.m43747t0(i, this.f176136a);
    }
}
