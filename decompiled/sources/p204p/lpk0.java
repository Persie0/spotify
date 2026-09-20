package p204p;

import com.google.protobuf.Timestamp;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lpk0 {
    /* JADX INFO: renamed from: a */
    public static final long m59675a(Timestamp timestamp) {
        long jM1969s = timestamp.m1969s();
        return TimeUnit.NANOSECONDS.toMillis(timestamp.m1968r()) + TimeUnit.SECONDS.toMillis(jM1969s);
    }
}
