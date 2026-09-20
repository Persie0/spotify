package p204p;

import com.spotify.player.model.command.options.LoggingParams;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class lsa0 extends hk60 {
    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) {
        LoggingParams.Builder builder = LoggingParams.builder();
        xl60Var.mo51076c();
        while (xl60Var.mo51079i()) {
            if (wj50.m88271j(xl60Var.mo51084s(), "command_initiated_time")) {
                builder.commandInitiatedTime(Long.valueOf(xl60Var.mo51083r()));
            } else {
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return builder.build();
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) throws IOException {
        throw new IOException("Serializing LoggingParams is not supported");
    }
}
