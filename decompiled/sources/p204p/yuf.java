package p204p;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yuf {

    /* JADX INFO: renamed from: a */
    public static final yuf f276337a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ yuf[] f276338b;

    /* JADX INFO: Fake field, exist only in values array */
    yuf EF0;

    static {
        yuf yufVar = new yuf("NOT_SET", 0);
        yuf yufVar2 = new yuf("EVENT_OVERRIDE", 1);
        f276337a = yufVar2;
        f276338b = new yuf[]{yufVar, yufVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, yufVar);
        sparseArray.put(5, yufVar2);
    }

    public static yuf valueOf(String str) {
        return (yuf) Enum.valueOf(yuf.class, str);
    }

    public static yuf[] values() {
        return (yuf[]) f276338b.clone();
    }
}
