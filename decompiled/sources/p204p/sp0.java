package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/sp0;", "", "", "testCase", "sessionId", "Lp/o2x0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "c", "(Lp/fbk;)Ljava/lang/Object;", "format", "b", "src_main_java_com_spotify_adsinternal_admocker-admocker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface sp0 {
    @zk00("mock/ad")
    /* JADX INFO: renamed from: a */
    Object m78846a(@hit0("test_case") String str, @hit0("session_id") String str2, fbk<? super o2x0<String>> fbkVar);

    @zk00("log/dump")
    /* JADX INFO: renamed from: b */
    Object m78847b(@hit0("fmt") String str, @hit0("session_id") String str2, fbk<? super o2x0<Object>> fbkVar);

    @zk00("mock/list")
    /* JADX INFO: renamed from: c */
    Object m78848c(fbk<? super o2x0<Object>> fbkVar);
}
