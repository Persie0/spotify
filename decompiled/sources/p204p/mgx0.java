package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mgx0 extends AbstractC1804e7 {

    /* JADX INFO: renamed from: c */
    public int f143670c;

    /* JADX INFO: renamed from: d */
    public int f143671d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ngx0 f143672e;

    public mgx0(ngx0 ngx0Var) {
        this.f143672e = ngx0Var;
        this.f143670c = ngx0Var.f153811d;
        this.f143671d = ngx0Var.f153810c;
    }

    @Override // p204p.AbstractC1804e7
    /* JADX INFO: renamed from: a */
    public final void mo37275a() {
        int i = this.f143670c;
        if (i == 0) {
            this.f56782a = 2;
            return;
        }
        ngx0 ngx0Var = this.f143672e;
        Object[] objArr = ngx0Var.f153808a;
        int i2 = this.f143671d;
        this.f56783b = objArr[i2];
        this.f56782a = 1;
        this.f143671d = (i2 + 1) % ngx0Var.f153809b;
        this.f143670c = i - 1;
    }
}
