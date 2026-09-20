package p204p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class f290 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65138b;

    public /* synthetic */ f290(Object obj, int i) {
        this.f65137a = i;
        this.f65138b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        rhs rhsVar;
        switch (this.f65137a) {
            case 0:
                if (i != -1 && (rhsVar = ((k290) this.f65138b).f118573c) != null) {
                    rhsVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f65138b).m139p(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f65137a;
    }

    /* JADX INFO: renamed from: a */
    private final void m40580a(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: b */
    private final void m40581b(AdapterView adapterView) {
    }
}
