package p204p;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: p.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281q5 implements euk {

    /* JADX INFO: renamed from: a */
    public final float f185367a;

    public C2281q5(float f) {
        this.f185367a = f;
    }

    @Override // p204p.euk
    /* JADX INFO: renamed from: a */
    public final float mo40076a(RectF rectF) {
        return this.f185367a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2281q5) && this.f185367a == ((C2281q5) obj).f185367a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f185367a)});
    }
}
