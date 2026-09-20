package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class goc0 implements wc40 {

    /* JADX INFO: renamed from: a */
    public final e940 f82932a;

    /* JADX INFO: renamed from: b */
    public final jxq0 f82933b;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f82934c = new PublishSubject();

    /* JADX INFO: renamed from: d */
    public boolean f82935d;

    /* JADX INFO: renamed from: e */
    public fh0 f82936e;

    /* JADX INFO: renamed from: f */
    public wb40 f82937f;

    public goc0(e940 e940Var, jxq0 jxq0Var) {
        this.f82932a = e940Var;
        this.f82933b = jxq0Var;
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public final void mo26031h(int i, Bitmap bitmap) {
        fh0 fh0Var;
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.f82935d && (fh0Var = this.f82936e) != null) {
            this.f82934c.onNext(new crc0(this.f82933b.m54724b(fh0Var)));
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public final void mo26038o(Drawable drawable) {
        fh0 fh0Var = this.f82936e;
        this.f82934c.onNext(new brc0(fh0Var != null ? this.f82933b.m54724b(fh0Var).m86038c() : null));
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public final void mo26033j(Drawable drawable) {
    }
}
