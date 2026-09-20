package p204p;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l0w0 implements euk {

    /* JADX INFO: renamed from: a */
    public final float f128527a;

    public l0w0(float f) {
        this.f128527a = f;
    }

    @Override // p204p.euk
    /* JADX INFO: renamed from: a */
    public final float mo40076a(RectF rectF) {
        return rectF.height() * this.f128527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0w0) && this.f128527a == ((l0w0) obj).f128527a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f128527a)});
    }
}
