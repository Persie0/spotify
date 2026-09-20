package p204p;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mva {

    /* JADX INFO: renamed from: a */
    public static final int f147544a;

    /* JADX INFO: renamed from: b */
    public static final UUID f147545b;

    /* JADX INFO: renamed from: c */
    public static final UUID f147546c;

    /* JADX INFO: renamed from: d */
    public static final UUID f147547d;

    /* JADX INFO: renamed from: e */
    public static final UUID f147548e;

    /* JADX INFO: renamed from: f */
    public static final UUID f147549f;

    static {
        f147544a = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
        f147545b = new UUID(0L, 0L);
        f147546c = new UUID(1186680826959645954L, -5988876978535335093L);
        f147547d = new UUID(-2129748144642739255L, 8654423357094679310L);
        f147548e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f147549f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
