package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r6h1 {

    /* JADX INFO: renamed from: a */
    public static final f9f1 f196279a = f9f1.m41055a(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static final f9f1 m74854a(int i) {
        return f9f1.m41055a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    /* JADX INFO: renamed from: b */
    public static final f9f1 m74855b(int i) {
        return f9f1.m41055a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
