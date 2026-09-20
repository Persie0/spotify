package p204p;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wwe implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public m3x f255754a;

    /* JADX INFO: renamed from: b */
    public WeakReference f255755b;

    /* JADX INFO: renamed from: c */
    public WeakReference f255756c;

    /* JADX INFO: renamed from: d */
    public AdapterView.OnItemClickListener f255757d;

    /* JADX INFO: renamed from: e */
    public boolean f255758e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemClickListener onItemClickListener = this.f255757d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        View view2 = (View) this.f255756c.get();
        AdapterView adapterView2 = (AdapterView) this.f255755b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        xwe.m92282b(this.f255754a, view2, adapterView2);
    }
}
