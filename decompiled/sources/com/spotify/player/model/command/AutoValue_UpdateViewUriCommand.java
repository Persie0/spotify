package com.spotify.player.model.command;

import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_UpdateViewUriCommand extends UpdateViewUriCommand {
    private final String viewUri;

    public static final class Builder extends UpdateViewUriCommand.Builder {
        private String viewUri;

        public Builder() {
        }

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand build() {
            String str = this.viewUri;
            if (str != null) {
                return new AutoValue_UpdateViewUriCommand(str, 0);
            }
            throw new IllegalStateException("Missing required properties: viewUri");
        }

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand.Builder viewUri(String str) {
            if (str == null) {
                throw new NullPointerException("Null viewUri");
            }
            this.viewUri = str;
            return this;
        }

        public Builder(UpdateViewUriCommand updateViewUriCommand) {
            this.viewUri = updateViewUriCommand.viewUri();
        }
    }

    public /* synthetic */ AutoValue_UpdateViewUriCommand(String str, int i) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateViewUriCommand) {
            return this.viewUri.equals(((UpdateViewUriCommand) obj).viewUri());
        }
        return false;
    }

    public int hashCode() {
        return this.viewUri.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    public UpdateViewUriCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("UpdateViewUriCommand{viewUri=", this.viewUri, "}");
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    public String viewUri() {
        return this.viewUri;
    }

    private AutoValue_UpdateViewUriCommand(String str) {
        this.viewUri = str;
    }
}
