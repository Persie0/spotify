package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m24212d2 = {"Lp/rbt0;", "", "", "connectionType", "headphoneIdentifier", "specificEnabledFilterId", "Lp/o2x0;", "Lp/w2a1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "", "format", "Lp/lc10;", "c", "(ILp/fbk;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_puffin_crossdevicesyncing-crossdevicesyncing"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface rbt0 {
    @j3m0("better-sound-tempo/v1/user/headphones")
    /* JADX INFO: renamed from: a */
    Object m75178a(@hit0("connectionType") String str, @hit0("identifier") String str2, @hit0("specificEnabledFilterId") String str3, fbk<? super o2x0<w2a1>> fbkVar);

    @pem("better-sound-tempo/v1/user/headphones")
    /* JADX INFO: renamed from: b */
    Object m75179b(@hit0("connectionType") String str, @hit0("identifier") String str2, fbk<? super o2x0<w2a1>> fbkVar);

    @zk00("better-sound-tempo/v1/user/headphones")
    /* JADX INFO: renamed from: c */
    Object m75180c(@hit0("format") int i, fbk<? super o2x0<lc10>> fbkVar);
}
