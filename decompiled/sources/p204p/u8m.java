package p204p;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u8m extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public boolean f227973a;

    /* JADX INFO: renamed from: b */
    public boolean f227974b;

    /* JADX INFO: renamed from: c */
    public Cursor f227975c;

    /* JADX INFO: renamed from: d */
    public int f227976d;

    /* JADX INFO: renamed from: e */
    public s8m f227977e;

    /* JADX INFO: renamed from: f */
    public t8m f227978f;

    /* JADX INFO: renamed from: g */
    public a38 f227979g;

    /* JADX INFO: renamed from: a */
    public abstract void mo71985a(View view, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public void mo71986b(Cursor cursor) {
        Cursor cursor2 = this.f227975c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                s8m s8mVar = this.f227977e;
                if (s8mVar != null) {
                    cursor2.unregisterContentObserver(s8mVar);
                }
                t8m t8mVar = this.f227978f;
                if (t8mVar != null) {
                    cursor2.unregisterDataSetObserver(t8mVar);
                }
            }
            this.f227975c = cursor;
            if (cursor != null) {
                s8m s8mVar2 = this.f227977e;
                if (s8mVar2 != null) {
                    cursor.registerContentObserver(s8mVar2);
                }
                t8m t8mVar2 = this.f227978f;
                if (t8mVar2 != null) {
                    cursor.registerDataSetObserver(t8mVar2);
                }
                this.f227976d = cursor.getColumnIndexOrThrow("_id");
                this.f227973a = true;
                notifyDataSetChanged();
            } else {
                this.f227976d = -1;
                this.f227973a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo71987c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo71988d(ViewGroup viewGroup);

    /* JADX INFO: renamed from: e */
    public final void m82587e() {
        Cursor cursor;
        if (!this.f227974b || (cursor = this.f227975c) == null || cursor.isClosed()) {
            return;
        }
        this.f227973a = this.f227975c.requery();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f227973a || (cursor = this.f227975c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f227973a) {
            return null;
        }
        this.f227975c.moveToPosition(i);
        if (view == null) {
            q261 q261Var = (q261) this;
            view = q261Var.f184524t.inflate(q261Var.f184523i, viewGroup, false);
        }
        mo71985a(view, this.f227975c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f227979g == null) {
            a38 a38Var = new a38();
            a38Var.f11896b = this;
            this.f227979g = a38Var;
        }
        return this.f227979g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f227973a || (cursor = this.f227975c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f227975c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f227973a && (cursor = this.f227975c) != null && cursor.moveToPosition(i)) {
            return this.f227975c.getLong(this.f227976d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f227973a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f227975c.moveToPosition(i)) {
            throw new IllegalStateException(s571.m77246e(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = mo71988d(viewGroup);
        }
        mo71985a(view, this.f227975c);
        return view;
    }
}
