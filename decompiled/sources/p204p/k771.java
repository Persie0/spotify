package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k771 extends ax41 {

    /* JADX INFO: renamed from: c */
    public CharSequence f119997c;

    /* JADX INFO: renamed from: d */
    public List f119998d;

    /* JADX INFO: renamed from: e */
    public ic71 f119999e;

    /* JADX INFO: renamed from: f */
    public if71 f120000f;

    /* JADX INFO: renamed from: g */
    public boolean f120001g;

    /* JADX INFO: renamed from: h */
    public boolean f120002h;

    /* JADX INFO: renamed from: i */
    public float f120003i;

    /* JADX INFO: renamed from: j */
    public float f120004j;

    /* JADX INFO: renamed from: k */
    public ko70 f120005k;

    /* JADX INFO: renamed from: l */
    public hzz f120006l;

    /* JADX INFO: renamed from: m */
    public long f120007m;

    /* JADX INFO: renamed from: n */
    public db71 f120008n;

    public k771() {
        super(ua31.m82674j().mo28818g());
        this.f120003i = Float.NaN;
        this.f120004j = Float.NaN;
        this.f120007m = e8j.m38111b(0, 0, 0, 0, 15);
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: a */
    public final void mo27359a(ax41 ax41Var) {
        k771 k771Var = (k771) ax41Var;
        this.f119997c = k771Var.f119997c;
        this.f119998d = k771Var.f119998d;
        this.f119999e = k771Var.f119999e;
        this.f120000f = k771Var.f120000f;
        this.f120001g = k771Var.f120001g;
        this.f120002h = k771Var.f120002h;
        this.f120003i = k771Var.f120003i;
        this.f120004j = k771Var.f120004j;
        this.f120005k = k771Var.f120005k;
        this.f120006l = k771Var.f120006l;
        this.f120007m = k771Var.f120007m;
        this.f120008n = k771Var.f120008n;
    }

    @Override // p204p.ax41
    /* JADX INFO: renamed from: b */
    public final ax41 mo27360b() {
        return new k771();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.f119997c) + ", annotations=" + this.f119998d + ", composition=" + this.f119999e + ", textStyle=" + this.f120000f + ", singleLine=" + this.f120001g + ", softWrap=" + this.f120002h + ", densityValue=" + this.f120003i + ", fontScale=" + this.f120004j + ", layoutDirection=" + this.f120005k + ", fontFamilyResolver=" + this.f120006l + ", constraints=" + ((Object) b8j.m28434m(this.f120007m)) + ", layoutResult=" + this.f120008n + ')';
    }
}
