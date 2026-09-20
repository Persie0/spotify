package p204p;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mv61 {

    /* JADX INFO: renamed from: a */
    public static final String f147520a = fmg1.m42125R();

    /* JADX INFO: renamed from: b */
    public static final long f147521b = fmg1.m42124Q(100000, 1, "kotlinx.coroutines.scheduler.resolution.ns", Long.MAX_VALUE);

    /* JADX INFO: renamed from: c */
    public static final int f147522c;

    /* JADX INFO: renamed from: d */
    public static final int f147523d;

    /* JADX INFO: renamed from: e */
    public static final long f147524e;

    /* JADX INFO: renamed from: f */
    public static final hvi0 f147525f;

    static {
        int iM42122M = fmg1.m42122M();
        if (iM42122M < 2) {
            iM42122M = 2;
        }
        f147522c = fmg1.m42123P(iM42122M, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.scheduler.core.pool.size");
        f147523d = fmg1.m42123P(2097150, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.scheduler.max.pool.size");
        f147524e = TimeUnit.SECONDS.toNanos(fmg1.m42124Q(60L, 1L, "kotlinx.coroutines.scheduler.keep.alive.sec", Long.MAX_VALUE));
        f147525f = hvi0.f95732b;
    }
}
