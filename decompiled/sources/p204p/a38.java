package p204p;

import android.database.Cursor;
import android.widget.BaseAdapter;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes4.dex */
public final class a38 extends Filter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11895a = 1;

    /* JADX INFO: renamed from: b */
    public BaseAdapter f11896b;

    public /* synthetic */ a38() {
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.f11895a) {
            case 1:
                return ((q261) ((u8m) this.f11896b)).mo71987c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorM71991h;
        switch (this.f11895a) {
            case 0:
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.count = ((b38) this.f11896b).getCount();
                return filterResults;
            default:
                q261 q261Var = (q261) ((u8m) this.f11896b);
                SearchView searchView = q261Var.f184519X;
                String string = charSequence == null ? "" : charSequence.toString();
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursorM71991h = q261Var.m71991h(q261Var.f184520Y, string);
                        if (cursorM71991h != null) {
                            cursorM71991h.getCount();
                        } else {
                            cursorM71991h = null;
                        }
                        break;
                    } catch (RuntimeException unused) {
                    }
                } else {
                    cursorM71991h = null;
                }
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                if (cursorM71991h != null) {
                    filterResults2.count = cursorM71991h.getCount();
                    filterResults2.values = cursorM71991h;
                } else {
                    filterResults2.count = 0;
                    filterResults2.values = null;
                }
                return filterResults2;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.f11895a) {
            case 0:
                ((b38) this.f11896b).notifyDataSetChanged();
                break;
            default:
                u8m u8mVar = (u8m) this.f11896b;
                Cursor cursor = u8mVar.f227975c;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    ((q261) u8mVar).mo71986b((Cursor) obj);
                    break;
                }
                break;
        }
    }

    public a38(b38 b38Var) {
        this.f11896b = b38Var;
    }
}
