package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class mwo0 {

    /* JADX INFO: renamed from: a */
    public static final mwo0 f147835a;

    /* JADX INFO: renamed from: b */
    public static final mwo0 f147836b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mwo0[] f147837c;

    static {
        mwo0 mwo0Var = new mwo0("Unspecified", 0);
        f147835a = mwo0Var;
        mwo0 mwo0Var2 = new mwo0("ChapterSkip", 1);
        f147836b = mwo0Var2;
        f147837c = new mwo0[]{mwo0Var, mwo0Var2};
    }

    public static mwo0 valueOf(String str) {
        return (mwo0) Enum.valueOf(mwo0.class, str);
    }

    public static mwo0[] values() {
        return (mwo0[]) f147837c.clone();
    }
}
