package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class w301 {
    private static final /* synthetic */ lzv $ENTRIES;
    private static final /* synthetic */ w301[] $VALUES;

    @gk60(name = "ACTIVE_DEVICE_CHANGED")
    public static final w301 ACTIVE_DEVICE_CHANGED;

    @gk60(name = "DISCOVERABILITY_CHANGED")
    public static final w301 DISCOVERABILITY_CHANGED;

    @gk60(name = "JAM_CAPPING_STATE_CHANGED")
    public static final w301 JAM_CAPPING_STATE_CHANGED;

    @gk60(name = "NEW_SESSION")
    public static final w301 NEW_SESSION;

    @gk60(name = "PARTICIPANT_PROMOTED_TO_HOST")
    public static final w301 PARTICIPANT_PROMOTED_TO_HOST;

    @gk60(name = "QUEUE_ONLY_MODE_CONTROL_CHANGED")
    public static final w301 QUEUE_ONLY_MODE_CONTROL_CHANGED;

    @gk60(name = "QUICK_BLEND_CHANGED")
    public static final w301 QUICK_BLEND_CHANGED;

    @gk60(name = "SESSION_ACTIVATED")
    public static final w301 SESSION_ACTIVATED;

    @gk60(name = "SESSION_DELETED")
    public static final w301 SESSION_DELETED;

    @gk60(name = "SESSION_MEMBER_PAUSE_CHANGED")
    public static final w301 SESSION_MEMBER_PAUSE_CHANGED;

    @gk60(name = "SESSION_MEMBER_UPDATED")
    public static final w301 SESSION_MEMBER_UPDATED;

    @gk60(name = "UNKNOWN_UPDATE_TYPE")
    public static final w301 UNKNOWN_UPDATE_TYPE;

    @gk60(name = "USER_JOINED")
    public static final w301 USER_JOINED;

    @gk60(name = "USER_KICKED")
    public static final w301 USER_KICKED;

    @gk60(name = "USER_LEFT")
    public static final w301 USER_LEFT;

    @gk60(name = "VOLUME_CONTROL_PERMISSIONS_CHANGED")
    public static final w301 VOLUME_CONTROL_PERMISSIONS_CHANGED;

    @gk60(name = "WIFI_BROADCAST_CHANGED")
    public static final w301 WIFI_BROADCAST_CHANGED;

    @gk60(name = "YOU_JOINED")
    public static final w301 YOU_JOINED;

    @gk60(name = "YOU_LEFT")
    public static final w301 YOU_LEFT;

    @gk60(name = "YOU_WERE_KICKED")
    public static final w301 YOU_WERE_KICKED;

    static {
        w301 w301Var = new w301("UNKNOWN_UPDATE_TYPE", 0);
        UNKNOWN_UPDATE_TYPE = w301Var;
        w301 w301Var2 = new w301("NEW_SESSION", 1);
        NEW_SESSION = w301Var2;
        w301 w301Var3 = new w301("USER_JOINED", 2);
        USER_JOINED = w301Var3;
        w301 w301Var4 = new w301("USER_LEFT", 3);
        USER_LEFT = w301Var4;
        w301 w301Var5 = new w301("SESSION_DELETED", 4);
        SESSION_DELETED = w301Var5;
        w301 w301Var6 = new w301("YOU_LEFT", 5);
        YOU_LEFT = w301Var6;
        w301 w301Var7 = new w301("YOU_WERE_KICKED", 6);
        YOU_WERE_KICKED = w301Var7;
        w301 w301Var8 = new w301("YOU_JOINED", 7);
        YOU_JOINED = w301Var8;
        w301 w301Var9 = new w301("PARTICIPANT_PROMOTED_TO_HOST", 8);
        PARTICIPANT_PROMOTED_TO_HOST = w301Var9;
        w301 w301Var10 = new w301("DISCOVERABILITY_CHANGED", 9);
        DISCOVERABILITY_CHANGED = w301Var10;
        w301 w301Var11 = new w301("USER_KICKED", 10);
        USER_KICKED = w301Var11;
        w301 w301Var12 = new w301("VOLUME_CONTROL_PERMISSIONS_CHANGED", 11);
        VOLUME_CONTROL_PERMISSIONS_CHANGED = w301Var12;
        w301 w301Var13 = new w301("QUEUE_ONLY_MODE_CONTROL_CHANGED", 12);
        QUEUE_ONLY_MODE_CONTROL_CHANGED = w301Var13;
        w301 w301Var14 = new w301("WIFI_BROADCAST_CHANGED", 13);
        WIFI_BROADCAST_CHANGED = w301Var14;
        w301 w301Var15 = new w301("ACTIVE_DEVICE_CHANGED", 14);
        ACTIVE_DEVICE_CHANGED = w301Var15;
        w301 w301Var16 = new w301("QUICK_BLEND_CHANGED", 15);
        QUICK_BLEND_CHANGED = w301Var16;
        w301 w301Var17 = new w301("SESSION_MEMBER_UPDATED", 16);
        SESSION_MEMBER_UPDATED = w301Var17;
        w301 w301Var18 = new w301("SESSION_ACTIVATED", 17);
        SESSION_ACTIVATED = w301Var18;
        w301 w301Var19 = new w301("SESSION_MEMBER_PAUSE_CHANGED", 18);
        SESSION_MEMBER_PAUSE_CHANGED = w301Var19;
        w301 w301Var20 = new w301("JAM_CAPPING_STATE_CHANGED", 19);
        JAM_CAPPING_STATE_CHANGED = w301Var20;
        w301[] w301VarArr = {w301Var, w301Var2, w301Var3, w301Var4, w301Var5, w301Var6, w301Var7, w301Var8, w301Var9, w301Var10, w301Var11, w301Var12, w301Var13, w301Var14, w301Var15, w301Var16, w301Var17, w301Var18, w301Var19, w301Var20};
        $VALUES = w301VarArr;
        $ENTRIES = new nzv(w301VarArr);
    }

    public static w301 valueOf(String str) {
        return (w301) Enum.valueOf(w301.class, str);
    }

    public static w301[] values() {
        return (w301[]) $VALUES.clone();
    }
}
