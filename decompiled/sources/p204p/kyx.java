package p204p;

import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface kyx {

    /* JADX INFO: renamed from: a */
    public static final String f127930a = "packageName";

    /* JADX INFO: renamed from: b */
    public static final String f127931b = "clientId";

    /* JADX INFO: renamed from: c */
    public static final String f127932c = "category";

    /* JADX INFO: renamed from: d */
    public static final String f127933d = "transportType";

    /* JADX INFO: renamed from: e */
    public static final String f127934e = "protocol";

    @zk00("external-integration-recs/v1/{spaces-id}")
    /* JADX INFO: renamed from: a */
    Single<nt30> m57728a(@ubn0("spaces-id") String str, @hit0(SignalCommand.ENDPOINT_NAME) List<String> list, @hit0("page") String str2, @hit0("per_page") String str3, @hit0("region") String str4, @hit0("locale") String str5, @hit0("platform") String str6, @hit0("version") String str7, @hit0("dt") String str8, @hit0("suppress404") String str9, @hit0("suppress_response_codes") String str10, @hit0(f127930a) String str11, @hit0(f127931b) String str12, @hit0(f127932c) String str13, @hit0(f127933d) String str14, @hit0(f127934e) String str15);
}
