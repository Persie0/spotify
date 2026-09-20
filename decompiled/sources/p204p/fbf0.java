package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class fbf0 extends pf9 {

    /* JADX INFO: renamed from: g */
    public static final fbf0 f67818g;

    /* JADX INFO: renamed from: h */
    public static final fbf0 f67819h;

    /* JADX INFO: renamed from: f */
    public final boolean f67820f;

    static {
        fbf0 fbf0Var = new fbf0(false, new int[]{2, 3, 0});
        f67818g = fbf0Var;
        int i = fbf0Var.f176999c;
        int i2 = fbf0Var.f176998b;
        f67819h = (i2 == 1 && i == 9) ? new fbf0(false, new int[]{2, 0, 0}) : new fbf0(false, new int[]{i2, i + 1, 0});
        new fbf0(false, new int[0]);
    }

    public fbf0(boolean z, int[] iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.f67820f = z;
    }
}
