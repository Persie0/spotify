package p204p;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/tje;", "", "", ContextTrack.Metadata.KEY_PROVIDER, "voice", "ssml", "Lp/o2x0;", "Lp/p3x0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_fitness_workoutimpl-workoutimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface tje {
    @zk00("client-tts/v1/ssml/{provider}/mp3/{voice}/{ssml}")
    /* JADX INFO: renamed from: a */
    Object m80983a(@ubn0(ContextTrack.Metadata.KEY_PROVIDER) String str, @ubn0("voice") String str2, @ubn0(encoded = true, value = "ssml") String str3, fbk<? super o2x0<p3x0>> fbkVar);
}
