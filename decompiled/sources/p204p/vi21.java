package p204p;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vi21 {

    /* JADX INFO: renamed from: a */
    public static final Size f241602a = new Size(0, 0);

    /* JADX INFO: renamed from: b */
    public static final Size f241603b;

    /* JADX INFO: renamed from: c */
    public static final Size f241604c;

    /* JADX INFO: renamed from: d */
    public static final Size f241605d;

    /* JADX INFO: renamed from: e */
    public static final Size f241606e;

    /* JADX INFO: renamed from: f */
    public static final Size f241607f;

    static {
        new Size(320, 240);
        f241603b = new Size(640, 480);
        f241604c = new Size(720, 480);
        f241605d = new Size(1280, 720);
        f241606e = new Size(1920, 1080);
        f241607f = new Size(1920, 1440);
    }

    /* JADX INFO: renamed from: a */
    public static int m85581a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
