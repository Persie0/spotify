package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hla {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ hla[] $VALUES;
    public static final hla BROADCAST_OFF;
    public static final hla BROADCAST_ON;
    public static final hla BROADCAST_STATUS_UNKNOWN;
    public static final hla BROADCAST_UNAVAILABLE;

    static {
        hla hlaVar = new hla("BROADCAST_STATUS_UNKNOWN", 0);
        BROADCAST_STATUS_UNKNOWN = hlaVar;
        hla hlaVar2 = new hla("BROADCAST_UNAVAILABLE", 1);
        BROADCAST_UNAVAILABLE = hlaVar2;
        hla hlaVar3 = new hla("BROADCAST_ON", 2);
        BROADCAST_ON = hlaVar3;
        hla hlaVar4 = new hla("BROADCAST_OFF", 3);
        BROADCAST_OFF = hlaVar4;
        hla[] hlaVarArr = {hlaVar, hlaVar2, hlaVar3, hlaVar4};
        $VALUES = hlaVarArr;
        $ENTRIES = new nzv(hlaVarArr);
    }

    public static hla valueOf(String str) {
        return (hla) Enum.valueOf(hla.class, str);
    }

    public static hla[] values() {
        return (hla[]) $VALUES.clone();
    }
}
