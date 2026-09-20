package p204p;

import com.spotify.rcs.resolver.grpc.p141v0.Configuration;
import com.spotify.rcs.resolver.grpc.p141v0.EnumC1272f;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kb6 {
    /* JADX INFO: renamed from: a */
    public static lb6 m55932a() {
        return new lb6("", "", null, null, null, 0L, 0L);
    }

    /* JADX INFO: renamed from: b */
    public static lb6 m55933b(Configuration.AssignedValue assignedValue) {
        return new lb6(assignedValue.m20130r().getName(), assignedValue.m20130r().m20048o(), assignedValue.m20131s() == EnumC1272f.BOOL_VALUE ? Boolean.valueOf(assignedValue.m20126n().getValue()) : null, assignedValue.m20131s() == EnumC1272f.INT_VALUE ? Integer.valueOf(assignedValue.m20128p().getValue()) : null, assignedValue.m20131s() == EnumC1272f.ENUM_VALUE ? assignedValue.m20127o().getValue() : null, assignedValue.m20129q().m20136o(), assignedValue.m20129q().getPolicyId());
    }
}
