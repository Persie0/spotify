package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mj50 implements oj50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f144166a;

    public mj50(float f) {
        this.f144166a = f;
    }

    @Override // p204p.oj50
    /* JADX INFO: renamed from: h */
    public final float mo61924h(float f, float f2, float f3) {
        return this.f144166a;
    }

    public final String toString() {
        return String.format(Locale.US, "point(%.2f)", Float.valueOf(this.f144166a));
    }
}
