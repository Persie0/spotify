package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hrv implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f94541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f94542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f94543c;

    public hrv(niz nizVar, long j, long j2) {
        this.f94541a = nizVar;
        this.f94542b = j;
        this.f94543c = j2;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        List list = (List) obj;
        Object objEmit = this.f94541a.emit(new npk(this.f94542b, this.f94543c, list != null ? (nu71) g6f.m43747t0(0, list) : null, list != null ? (nu71) g6f.m43747t0(1, list) : null), fbkVar);
        return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
    }
}
