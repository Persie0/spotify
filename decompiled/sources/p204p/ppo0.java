package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ppo0 implements Parcelable {
    public static final Parcelable.Creator<ppo0> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ppo0 f180083a;

    /* JADX INFO: renamed from: b */
    public static final ppo0 f180084b;

    /* JADX INFO: renamed from: c */
    public static final ppo0 f180085c;

    /* JADX INFO: renamed from: d */
    public static final ppo0 f180086d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ppo0[] f180087e;

    static {
        ppo0 ppo0Var = new ppo0("OFF", 0);
        f180083a = ppo0Var;
        ppo0 ppo0Var2 = new ppo0("AUDIO", 1);
        f180084b = ppo0Var2;
        ppo0 ppo0Var3 = new ppo0("VIDEO", 2);
        f180085c = ppo0Var3;
        ppo0 ppo0Var4 = new ppo0("ALL", 3);
        f180086d = ppo0Var4;
        f180087e = new ppo0[]{ppo0Var, ppo0Var2, ppo0Var3, ppo0Var4};
        CREATOR = new igo0(4);
    }

    public static ppo0 valueOf(String str) {
        return (ppo0) Enum.valueOf(ppo0.class, str);
    }

    public static ppo0[] values() {
        return (ppo0[]) f180087e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
