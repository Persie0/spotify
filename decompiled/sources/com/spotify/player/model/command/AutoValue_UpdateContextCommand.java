package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_UpdateContextCommand extends UpdateContextCommand {
    private final Context context;

    public static final class Builder extends UpdateContextCommand.Builder {
        private Context context;

        public Builder() {
        }

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand build() {
            Context context = this.context;
            if (context != null) {
                return new AutoValue_UpdateContextCommand(context, 0);
            }
            throw new IllegalStateException("Missing required properties: context");
        }

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand.Builder context(Context context) {
            if (context == null) {
                throw new NullPointerException("Null context");
            }
            this.context = context;
            return this;
        }

        public Builder(UpdateContextCommand updateContextCommand) {
            this.context = updateContextCommand.context();
        }
    }

    public /* synthetic */ AutoValue_UpdateContextCommand(Context context, int i) {
        this(context);
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateContextCommand) {
            return this.context.equals(((UpdateContextCommand) obj).context());
        }
        return false;
    }

    public int hashCode() {
        return this.context.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    public UpdateContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("UpdateContextCommand{context=", String.valueOf(this.context), "}");
    }

    private AutoValue_UpdateContextCommand(Context context) {
        this.context = context;
    }
}
