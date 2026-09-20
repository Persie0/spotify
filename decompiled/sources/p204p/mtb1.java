package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mtb1 {

    /* JADX INFO: renamed from: a */
    public static final mtb1 f147016a;

    /* JADX INFO: renamed from: b */
    public static final mtb1 f147017b;

    /* JADX INFO: renamed from: c */
    public static final mtb1 f147018c;

    /* JADX INFO: renamed from: d */
    public static final mtb1 f147019d;

    /* JADX INFO: renamed from: e */
    public static final mtb1 f147020e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ mtb1[] f147021f;

    /* JADX INFO: Fake field, exist only in values array */
    mtb1 EF0;

    static {
        mtb1 mtb1Var = new mtb1("Unavailable", 0);
        mtb1 mtb1Var2 = new mtb1("NotDownloaded", 1);
        f147016a = mtb1Var2;
        mtb1 mtb1Var3 = new mtb1("Waiting", 2);
        f147017b = mtb1Var3;
        mtb1 mtb1Var4 = new mtb1("Downloading", 3);
        f147018c = mtb1Var4;
        mtb1 mtb1Var5 = new mtb1("Downloaded", 4);
        f147019d = mtb1Var5;
        mtb1 mtb1Var6 = new mtb1("Error", 5);
        f147020e = mtb1Var6;
        f147021f = new mtb1[]{mtb1Var, mtb1Var2, mtb1Var3, mtb1Var4, mtb1Var5, mtb1Var6};
    }

    public static mtb1 valueOf(String str) {
        return (mtb1) Enum.valueOf(mtb1.class, str);
    }

    public static mtb1[] values() {
        return (mtb1[]) f147021f.clone();
    }
}
