package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zt81 extends qe70 implements zh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fat0 f286097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f286098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f286099c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f12 f286100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt81(fat0 fat0Var, boolean z, Map map, f12 f12Var) {
        super(5);
        this.f286097a = fat0Var;
        this.f286098b = z;
        this.f286099c = map;
        this.f286100d = f12Var;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        bz31 bz31Var;
        jb81 jb81Var = (jb81) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        String str = jb81Var.f110691a;
        String str2 = jb81Var.f110692b;
        f12 f12Var = this.f286100d;
        yt81 yt81Var = new yt81(jb81Var, f12Var, zBooleanValue, 0);
        yt81 yt81Var2 = new yt81(jb81Var, f12Var, zBooleanValue, 1);
        fat0 fat0Var = this.f286097a;
        f5b0 f5b0Var = fat0Var.f67638b;
        String str3 = fat0Var.f67639c;
        boolean z2 = true;
        if (jb81Var.f110698h || zBooleanValue2) {
            z = false;
        } else {
            z = false;
            z2 = false;
        }
        return new ts81(str, str2, yt81Var, yt81Var2, f5b0Var, str3, z2, jb81Var.f110699i, (zBooleanValue3 && this.f286098b && jb81Var.f110700j) ? true : z, (jb81Var.f110697g != 2 || zBooleanValue || (bz31Var = (bz31) this.f286099c.get(str2)) == null) ? zy31.f287482a : bz31Var, zBooleanValue4);
    }
}
