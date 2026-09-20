package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class f7u implements w6u {

    /* JADX INFO: renamed from: b */
    public gf71 f66796b;

    /* JADX INFO: renamed from: a */
    public String f66795a = "";

    /* JADX INFO: renamed from: c */
    public int f66797c = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: d */
    public qe10 f66798d = oe10.f164317a;

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        f7u f7uVar = new f7u();
        f7uVar.f66798d = this.f66798d;
        f7uVar.f66795a = this.f66795a;
        f7uVar.f66796b = this.f66796b;
        f7uVar.f66797c = this.f66797c;
        return f7uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        return this.f66798d;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        this.f66798d = qe10Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.f66795a);
        sb.append(", style=");
        sb.append(this.f66796b);
        sb.append(", modifier=");
        sb.append(this.f66798d);
        sb.append(", maxLines=");
        return edb.m38567p(sb, this.f66797c, ')');
    }
}
