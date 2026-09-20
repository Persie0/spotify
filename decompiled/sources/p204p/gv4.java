package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final fv4 f84604a;

    /* JADX INFO: renamed from: b */
    public final bji f84605b;

    /* JADX INFO: renamed from: c */
    public final wg61 f84606c;

    public gv4(fv4 fv4Var, bji bjiVar) {
        this.f84604a = fv4Var;
        this.f84605b = bjiVar;
        this.f84606c = new wg61(new uu4(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final fv4 m45851a() {
        fv4 fv4VarM45851a;
        gv4 gv4Var = (gv4) this.f84606c.getValue();
        return (gv4Var == null || (fv4VarM45851a = gv4Var.m45851a()) == null) ? this.f84604a : fv4VarM45851a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m45851a().f73633a;
        fv4[] fv4VarArrValues = fv4.values();
        ArrayList arrayList = new ArrayList(fv4VarArrValues.length);
        for (fv4 fv4Var : fv4VarArrValues) {
            arrayList.add(fv4Var.f73633a);
        }
        return geg1.m44518y(new k8a("color_extraction_source", "android-widgets-colorextractionimpl", str, arrayList));
    }

    public gv4(bji bjiVar) {
        this(fv4.LOCAL_EXTRACTION, bjiVar);
    }
}
