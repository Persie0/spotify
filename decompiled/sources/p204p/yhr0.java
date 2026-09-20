package p204p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class yhr0 {

    /* JADX INFO: renamed from: e */
    public static final HashMap f272953e;

    /* JADX INFO: renamed from: a */
    public final boolean f272954a;

    /* JADX INFO: renamed from: b */
    public final File f272955b;

    /* JADX INFO: renamed from: c */
    public final Lock f272956c;

    /* JADX INFO: renamed from: d */
    public FileChannel f272957d;

    static {
        new r46(21);
        f272953e = new HashMap();
    }

    public yhr0(String str, File file, boolean z) {
        this.f272954a = z;
        this.f272955b = file != null ? new File(file, str.concat(".lck")) : null;
        this.f272956c = r46.m74734o(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m93692a(boolean z) {
        this.f272956c.lock();
        if (z) {
            File file = this.f272955b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f272957d = channel;
            } catch (IOException unused) {
                this.f272957d = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m93693b() {
        try {
            FileChannel fileChannel = this.f272957d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f272956c.unlock();
    }
}
