package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b38 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public final Context f22956a;

    /* JADX INFO: renamed from: b */
    public String f22957b;

    /* JADX INFO: renamed from: c */
    public String f22958c;

    /* JADX INFO: renamed from: d */
    public String f22959d;

    /* JADX INFO: renamed from: e */
    public List f22960e = lau.f131415a;

    /* JADX INFO: renamed from: f */
    public final a38 f22961f = new a38(this);

    public b38(Context context) {
        this.f22956a = context;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String getItem(int i) {
        if (i == 0) {
            return this.f22957b;
        }
        if (i == getCount() - 1) {
            return this.f22959d;
        }
        return this.f22960e.isEmpty() ? this.f22958c : ((gvy) this.f22960e.get(i - 1)).f84854a;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return Math.max(this.f22960e.size(), 1) + 2;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f22961f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getCount() - 1) {
            return 2;
        }
        return this.f22960e.isEmpty() ? 3 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            i2 = R.layout.view_autocomplete_item_cta;
        } else if (itemViewType != 2) {
            i2 = itemViewType != 3 ? R.layout.view_autocomplete_item : R.layout.view_autocomplete_item_no_result;
        } else {
            i2 = R.layout.view_autocomplete_item_attribution;
        }
        if (view == null) {
            view = LayoutInflater.from(this.f22956a).inflate(i2, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 1;
    }
}
