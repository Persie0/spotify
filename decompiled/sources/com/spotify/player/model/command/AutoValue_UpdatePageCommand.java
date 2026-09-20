package com.spotify.player.model.command;

import com.spotify.player.model.ContextPage;
import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_UpdatePageCommand extends UpdatePageCommand {
    private final ContextPage page;

    public static final class Builder extends UpdatePageCommand.Builder {
        private ContextPage page;

        public Builder() {
        }

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand build() {
            ContextPage contextPage = this.page;
            if (contextPage != null) {
                return new AutoValue_UpdatePageCommand(contextPage, 0);
            }
            throw new IllegalStateException("Missing required properties: page");
        }

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand.Builder page(ContextPage contextPage) {
            if (contextPage == null) {
                throw new NullPointerException("Null page");
            }
            this.page = contextPage;
            return this;
        }

        public Builder(UpdatePageCommand updatePageCommand) {
            this.page = updatePageCommand.page();
        }
    }

    public /* synthetic */ AutoValue_UpdatePageCommand(ContextPage contextPage, int i) {
        this(contextPage);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdatePageCommand) {
            return this.page.equals(((UpdatePageCommand) obj).page());
        }
        return false;
    }

    public int hashCode() {
        return this.page.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    public ContextPage page() {
        return this.page;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    public UpdatePageCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("UpdatePageCommand{page=", String.valueOf(this.page), "}");
    }

    private AutoValue_UpdatePageCommand(ContextPage contextPage) {
        this.page = contextPage;
    }
}
