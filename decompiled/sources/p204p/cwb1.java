package p204p;

import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto$State;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class cwb1 implements guz0 {

    /* JADX INFO: renamed from: a */
    public static final cwb1 f42692a = new cwb1();

    /* JADX INFO: renamed from: b */
    public static final VideoFirstProto$State f42693b = VideoFirstProto$State.m15945o();

    @Override // p204p.guz0
    /* JADX INFO: renamed from: a */
    public final Object mo30659a() {
        return f42693b;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: d */
    public final Object mo30660d(FileInputStream fileInputStream) {
        return VideoFirstProto$State.m15946q(fileInputStream);
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: e */
    public final void mo30661e(Object obj, pg21 pg21Var) {
        ((VideoFirstProto$State) obj).writeTo(pg21Var);
    }
}
