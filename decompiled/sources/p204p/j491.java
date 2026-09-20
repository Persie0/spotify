package p204p;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes9.dex */
public final class j491 implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f108629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f108630b;

    public j491(long j, long j2) {
        this.f108629a = j;
        this.f108630b = j2;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        return Long.valueOf(this.f108629a + ((long) (f * this.f108630b)));
    }
}
