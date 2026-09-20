package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayCommand extends PlayCommand {
    private final Context context;
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 playOptions;
    private final PlayOrigin playOrigin;

    public /* synthetic */ AutoValue_PlayCommand(Context context, PlayOrigin playOrigin, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(context, playOrigin, xul0Var, xul0Var2, xul0Var3);
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayCommand) {
            PlayCommand playCommand = (PlayCommand) obj;
            if (this.context.equals(playCommand.context()) && this.playOrigin.equals(playCommand.playOrigin()) && this.options.equals(playCommand.options()) && this.playOptions.equals(playCommand.playOptions()) && this.loggingParams.equals(playCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.playOptions.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public xul0 playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public PlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.context);
        String strValueOf2 = String.valueOf(this.playOrigin);
        String strValueOf3 = String.valueOf(this.options);
        String strValueOf4 = String.valueOf(this.playOptions);
        String strValueOf5 = String.valueOf(this.loggingParams);
        StringBuilder sbM38573v = edb.m38573v("PlayCommand{context=", strValueOf, ", playOrigin=", strValueOf2, ", options=");
        klh.m56844p(sbM38573v, strValueOf3, ", playOptions=", strValueOf4, ", loggingParams=");
        return dq60.m36616p(strValueOf5, "}", sbM38573v);
    }

    private AutoValue_PlayCommand(Context context, PlayOrigin playOrigin, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.context = context;
        this.playOrigin = playOrigin;
        this.options = xul0Var;
        this.playOptions = xul0Var2;
        this.loggingParams = xul0Var3;
    }

    public static final class Builder extends PlayCommand.Builder {
        private Context context;
        private xul0 loggingParams;
        private xul0 options;
        private xul0 playOptions;
        private PlayOrigin playOrigin;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.playOptions = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand build() {
            PlayOrigin playOrigin;
            Context context = this.context;
            if (context != null && (playOrigin = this.playOrigin) != null) {
                return new AutoValue_PlayCommand(context, playOrigin, this.options, this.playOptions, this.loggingParams, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.context == null) {
                sb.append(" context");
            }
            if (this.playOrigin == null) {
                sb.append(" playOrigin");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder context(Context context) {
            if (context == null) {
                throw new NullPointerException("Null context");
            }
            this.context = context;
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = xul0.m92201d(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder playOptions(PlayOptions playOptions) {
            this.playOptions = xul0.m92201d(playOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder playOrigin(PlayOrigin playOrigin) {
            if (playOrigin == null) {
                throw new NullPointerException("Null playOrigin");
            }
            this.playOrigin = playOrigin;
            return this;
        }

        public Builder(PlayCommand playCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.playOptions = c2244p5;
            this.loggingParams = c2244p5;
            this.context = playCommand.context();
            this.playOrigin = playCommand.playOrigin();
            this.options = playCommand.options();
            this.playOptions = playCommand.playOptions();
            this.loggingParams = playCommand.loggingParams();
        }
    }
}
