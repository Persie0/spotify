package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class br30 {
    /* JADX INFO: renamed from: a */
    public static final boolean m30285a(br30 br30Var, Object obj, Object obj2) {
        br30Var.getClass();
        Class<?> componentType = obj.getClass().getComponentType();
        if (!wj50.m88271j(componentType, obj2 != null ? obj2.getClass().getComponentType() : null)) {
            return false;
        }
        if (wj50.m88271j(componentType, String.class)) {
            return Arrays.equals((String[]) obj, (String[]) obj2);
        }
        if (wj50.m88271j(componentType, Long.TYPE)) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (wj50.m88271j(componentType, Double.TYPE)) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if (wj50.m88271j(componentType, Boolean.TYPE)) {
            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
        }
        if (wj50.m88271j(componentType, Integer.TYPE)) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (wj50.m88271j(componentType, Float.TYPE)) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        return wj50.m88271j(componentType, Byte.TYPE) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: b */
    public static final int m30286b(br30 br30Var, Object obj) {
        int iHashCode;
        br30Var.getClass();
        Class<?> componentType = obj.getClass().getComponentType();
        if (wj50.m88271j(componentType, String.class)) {
            iHashCode = Arrays.hashCode((String[]) obj);
        } else if (wj50.m88271j(componentType, Long.TYPE)) {
            iHashCode = Arrays.hashCode((long[]) obj);
        } else if (wj50.m88271j(componentType, Double.TYPE)) {
            iHashCode = Arrays.hashCode((double[]) obj);
        } else if (wj50.m88271j(componentType, Boolean.TYPE)) {
            iHashCode = Arrays.hashCode((boolean[]) obj);
        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof wj30[])) {
            iHashCode = Arrays.hashCode((wj30[]) obj);
        } else if (wj50.m88271j(componentType, Integer.TYPE)) {
            iHashCode = Arrays.hashCode((int[]) obj);
        } else {
            iHashCode = wj50.m88271j(componentType, Float.TYPE) ? Arrays.hashCode((float[]) obj) : obj.hashCode();
        }
        return 31 + iHashCode;
    }

    /* JADX INFO: renamed from: c */
    public static vj30 m30287c() {
        return HubsImmutableComponentBundle.EMPTY.toBuilder();
    }

    /* JADX INFO: renamed from: d */
    public static HubsImmutableComponentBundle m30288d() {
        return new HubsImmutableComponentBundle();
    }

    /* JADX INFO: renamed from: e */
    public static HubsImmutableComponentBundle m30289e(wj30 wj30Var) {
        if (wj30Var == null) {
            return new HubsImmutableComponentBundle();
        }
        return wj30Var instanceof HubsImmutableComponentBundle ? (HubsImmutableComponentBundle) wj30Var : m30287c().mo39768a(wj30Var).mo33703d();
    }
}
