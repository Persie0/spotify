package p204p;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yvb {

    /* JADX INFO: renamed from: h */
    public static final sy7 f276629h = new sy7("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: i */
    public static final sy7 f276630i = new sy7("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: j */
    public static final sy7 f276631j = new sy7("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a */
    public final ArrayList f276632a;

    /* JADX INFO: renamed from: b */
    public final jvl0 f276633b;

    /* JADX INFO: renamed from: c */
    public final int f276634c;

    /* JADX INFO: renamed from: d */
    public final List f276635d;

    /* JADX INFO: renamed from: e */
    public final boolean f276636e;

    /* JADX INFO: renamed from: f */
    public final fs61 f276637f;

    /* JADX INFO: renamed from: g */
    public final ceb f276638g;

    public yvb(ArrayList arrayList, jvl0 jvl0Var, int i, ArrayList arrayList2, boolean z, fs61 fs61Var, ceb cebVar) {
        this.f276632a = arrayList;
        this.f276633b = jvl0Var;
        this.f276634c = i;
        this.f276635d = Collections.unmodifiableList(arrayList2);
        this.f276636e = z;
        this.f276637f = fs61Var;
        this.f276638g = cebVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m94682a() {
        Object objMo39828c = 0;
        try {
            objMo39828c = this.f276633b.mo39828c(jla1.f113570G0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo39828c;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public final int m94683b() {
        Object objMo39828c = 0;
        try {
            objMo39828c = this.f276633b.mo39828c(jla1.f113571H0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo39828c;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
