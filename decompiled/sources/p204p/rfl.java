package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class rfl implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198678a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t7q f198679b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f198680c;

    public /* synthetic */ rfl(t7q t7qVar, boolean z, int i) {
        this.f198678a = i;
        this.f198679b = t7qVar;
        this.f198680c = z;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f198678a) {
            case 0:
                nel nelVar = (nel) hwfVar;
                t7q t7qVar = this.f198679b;
                return new cgl((Context) t7qVar.f217871b, (e940) t7qVar.f217872c, nelVar != null ? nelVar.f153010a : null, nelVar != null ? nelVar.f153011b : null, nelVar != null ? nelVar.f153012c : null, nelVar != null && nelVar.f153013d, nelVar != null ? nelVar.f153014e : null, nelVar != null ? nelVar.f153016g : null, nelVar != null ? nelVar.f153017h : null, nelVar != null ? nelVar.f153018i : null, nelVar != null ? nelVar.f153019t : null, nelVar != null ? nelVar.f153007X : null, nelVar != null ? nelVar.f153008Y : null, nelVar != null ? nelVar.f153015f : null, nelVar != null ? nelVar.f153009Z : null, null, nelVar != null && nelVar.f153005L0, this.f198680c, nelVar != null ? nelVar.f153006M0 : oel.f164466c);
            default:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                t7q t7qVar2 = this.f198679b;
                return new clp((Context) t7qVar2.f217871b, (e940) t7qVar2.f217872c, this.f198680c);
        }
    }
}
