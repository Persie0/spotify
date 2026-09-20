package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PreparePlayCommand extends PreparePlayCommand {
    private final Context context;
    private final xul0 options;
    private final PlayOrigin playOrigin;

    public /* synthetic */ AutoValue_PreparePlayCommand(Context context, PlayOrigin playOrigin, xul0 xul0Var, int i) {
        this(context, playOrigin, xul0Var);
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayCommand) {
            PreparePlayCommand preparePlayCommand = (PreparePlayCommand) obj;
            if (this.context.equals(preparePlayCommand.context()) && this.playOrigin.equals(preparePlayCommand.playOrigin()) && this.options.equals(preparePlayCommand.options())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public PreparePlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.options), "}", edb.m38573v("PreparePlayCommand{context=", String.valueOf(this.context), ", playOrigin=", String.valueOf(this.playOrigin), ", options="));
    }

    public static final class Builder extends PreparePlayCommand.Builder {
        private Context context;
        private xul0 options;
        private PlayOrigin playOrigin;

        public Builder() {
            this.options = C2244p5.f174033a;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand build() {
            PlayOrigin playOrigin;
            Context context = this.context;
            if (context != null && (playOrigin = this.playOrigin) != null) {
                return new AutoValue_PreparePlayCommand(context, playOrigin, this.options, 0);
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

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder context(Context context) {
            if (context == null) {
                throw new NullPointerException("Null context");
            }
            this.context = context;
            return this;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = xul0.m92201d(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder playOrigin(PlayOrigin playOrigin) {
            if (playOrigin == null) {
                throw new NullPointerException("Null playOrigin");
            }
            this.playOrigin = playOrigin;
            return this;
        }

        public Builder(PreparePlayCommand preparePlayCommand) {
            this.options = C2244p5.f174033a;
            this.context = preparePlayCommand.context();
            this.playOrigin = preparePlayCommand.playOrigin();
            this.options = preparePlayCommand.options();
        }
    }

    private AutoValue_PreparePlayCommand(Context context, PlayOrigin playOrigin, xul0 xul0Var) {
        this.context = context;
        this.playOrigin = playOrigin;
        this.options = xul0Var;
    }
}
