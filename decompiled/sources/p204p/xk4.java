package p204p;

import android.graphics.Path;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk4 {
    /* JADX INFO: renamed from: a */
    public static final uk4 m91259a() {
        return new uk4(new Path());
    }

    /* JADX INFO: renamed from: b */
    public static final Path.Direction m91260b(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return Path.Direction.CCW;
        }
        if (iM38547C == 1) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final void m91261c(String str) {
        throw new IllegalStateException(str);
    }
}
