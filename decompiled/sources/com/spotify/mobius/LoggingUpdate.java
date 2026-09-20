package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.internal_util.Throwables;

/* JADX INFO: loaded from: classes2.dex */
class LoggingUpdate<M, E, F> implements Update<M, E, F> {

    /* JADX INFO: renamed from: a */
    public final Update f5565a;

    /* JADX INFO: renamed from: b */
    public final MobiusLoop.Logger f5566b;

    public LoggingUpdate(Update update, MobiusLoop.Logger logger) {
        Preconditions.m15649b(update);
        this.f5565a = update;
        Preconditions.m15649b(logger);
        this.f5566b = logger;
    }

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        MobiusLoop.Logger logger = this.f5566b;
        logger.mo15586d(obj, obj2);
        try {
            Next nextMo15577a = this.f5565a.mo15577a(obj, obj2);
            logger.mo15583a(obj, obj2, nextMo15577a);
            return nextMo15577a;
        } catch (Exception e) {
            logger.mo15584b(obj, obj2, e);
            Throwables.m15650a(e);
            throw null;
        }
    }
}
