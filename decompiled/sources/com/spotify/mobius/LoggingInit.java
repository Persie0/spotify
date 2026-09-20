package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.internal_util.Throwables;

/* JADX INFO: loaded from: classes2.dex */
class LoggingInit<M, F> implements Init<M, F> {

    /* JADX INFO: renamed from: a */
    public final Init f5563a;

    /* JADX INFO: renamed from: b */
    public final MobiusLoop.Logger f5564b;

    public LoggingInit(Init init, MobiusLoop.Logger logger) {
        Preconditions.m15649b(init);
        this.f5563a = init;
        Preconditions.m15649b(logger);
        this.f5564b = logger;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public final First mo15576f0(Object obj) {
        MobiusLoop.Logger logger = this.f5564b;
        logger.mo15587e(obj);
        try {
            First firstMo15576f0 = this.f5563a.mo15576f0(obj);
            logger.mo15585c(obj, firstMo15576f0);
            return firstMo15576f0;
        } catch (Exception e) {
            logger.mo15588f(obj, e);
            Throwables.m15650a(e);
            throw null;
        }
    }
}
