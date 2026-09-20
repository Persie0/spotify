package com.spotify.mobius.coroutines;

import com.spotify.mobius.EventSource;
import kotlin.Metadata;
import p204p.fiz;
import p204p.n5q;
import p204p.nxf1;
import p204p.xsr;
import p204p.yab;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/FlowEventSources;", "", "Companion", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public interface FlowEventSources {

    /* JADX INFO: renamed from: a */
    public static final Companion f5713a = Companion.f5714a;

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/FlowEventSources$Companion;", "", "<init>", "()V", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5714a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static yab m15634a(EventSource eventSource) {
            return nxf1.m65827f(new FlowEventSources$Companion$asFlow$1(eventSource, null));
        }

        /* JADX INFO: renamed from: b */
        public static C1045b m15635b(Companion companion, fiz[] fizVarArr) {
            n5q n5qVar = xsr.f265651a;
            companion.getClass();
            return new C1045b(n5qVar, fizVarArr);
        }
    }
}
