package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class mto0 {

    /* JADX INFO: renamed from: a */
    public static final mto0 f147116a;

    /* JADX INFO: renamed from: b */
    public static final mto0 f147117b;

    /* JADX INFO: renamed from: c */
    public static final mto0 f147118c;

    /* JADX INFO: renamed from: d */
    public static final mto0 f147119d;

    /* JADX INFO: renamed from: e */
    public static final mto0 f147120e;

    /* JADX INFO: renamed from: f */
    public static final mto0 f147121f;

    /* JADX INFO: renamed from: g */
    public static final mto0 f147122g;

    /* JADX INFO: renamed from: h */
    public static final mto0 f147123h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ mto0[] f147124i;

    static {
        mto0 mto0Var = new mto0("Unknown", 0);
        f147116a = mto0Var;
        mto0 mto0Var2 = new mto0("NoRestriction", 1);
        f147117b = mto0Var2;
        mto0 mto0Var3 = new mto0("PremiumOnly", 2);
        f147118c = mto0Var3;
        mto0 mto0Var4 = new mto0("ExplicitContent", 3);
        f147119d = mto0Var4;
        mto0 mto0Var5 = new mto0("AgeRestricted", 4);
        f147120e = mto0Var5;
        mto0 mto0Var6 = new mto0("NotInCatalogue", 5);
        f147121f = mto0Var6;
        mto0 mto0Var7 = new mto0("NotAvailableOffline", 6);
        f147122g = mto0Var7;
        mto0 mto0Var8 = new mto0("BlockedByAccountManager", 7);
        f147123h = mto0Var8;
        f147124i = new mto0[]{mto0Var, mto0Var2, mto0Var3, mto0Var4, mto0Var5, mto0Var6, mto0Var7, mto0Var8};
    }

    public static mto0 valueOf(String str) {
        return (mto0) Enum.valueOf(mto0.class, str);
    }

    public static mto0[] values() {
        return (mto0[]) f147124i.clone();
    }
}
