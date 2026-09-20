package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class nj50 implements oj50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f154441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f154442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f154443c;

    public nj50(float f, float f2, float f3) {
        this.f154441a = f;
        this.f154442b = f2;
        this.f154443c = f3;
    }

    @Override // p204p.oj50
    /* JADX INFO: renamed from: h */
    public final float mo61924h(float f, float f2, float f3) {
        float f4 = this.f154442b;
        float f5 = this.f154441a;
        float f6 = f4 - f5;
        if (f6 == 0.0f) {
            f6 = 1.0f / f4;
        }
        float f7 = (f3 - f5) / f6;
        return (0.0f * f7) + ((1.0f - f7) * this.f154443c);
    }

    public final String toString() {
        return String.format(Locale.US, "map(%.2f, %.2f, %.2f, %.2f)", Float.valueOf(this.f154441a), Float.valueOf(this.f154442b), Float.valueOf(this.f154443c), Float.valueOf(0.0f));
    }
}
