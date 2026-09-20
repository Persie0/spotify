package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayOptions extends PlayOptions {
    private final CommandOptions commandOptions;
    private final xul0 operation;
    private final xul0 trigger;

    public /* synthetic */ AutoValue_PlayOptions(xul0 xul0Var, xul0 xul0Var2, CommandOptions commandOptions, int i) {
        this(xul0Var, xul0Var2, commandOptions);
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayOptions) {
            PlayOptions playOptions = (PlayOptions) obj;
            if (this.operation.equals(playOptions.operation()) && this.trigger.equals(playOptions.trigger()) && this.commandOptions.equals(playOptions.commandOptions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.operation.hashCode() ^ 1000003) * 1000003) ^ this.trigger.hashCode()) * 1000003) ^ this.commandOptions.hashCode();
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public xul0 operation() {
        return this.operation;
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public PlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.commandOptions), "}", edb.m38573v("PlayOptions{operation=", String.valueOf(this.operation), ", trigger=", String.valueOf(this.trigger), ", commandOptions="));
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public xul0 trigger() {
        return this.trigger;
    }

    private AutoValue_PlayOptions(xul0 xul0Var, xul0 xul0Var2, CommandOptions commandOptions) {
        this.operation = xul0Var;
        this.trigger = xul0Var2;
        this.commandOptions = commandOptions;
    }

    public static final class Builder extends PlayOptions.Builder {
        private CommandOptions commandOptions;
        private xul0 operation;
        private xul0 trigger;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.operation = c2244p5;
            this.trigger = c2244p5;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions build() {
            if (this.commandOptions != null) {
                return new AutoValue_PlayOptions(this.operation, this.trigger, this.commandOptions, 0);
            }
            throw new IllegalStateException("Missing required properties: commandOptions");
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder commandOptions(CommandOptions commandOptions) {
            if (commandOptions == null) {
                throw new NullPointerException("Null commandOptions");
            }
            this.commandOptions = commandOptions;
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder operation(PlayOperation playOperation) {
            this.operation = xul0.m92201d(playOperation);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder trigger(PlayTrigger playTrigger) {
            this.trigger = xul0.m92201d(playTrigger);
            return this;
        }

        public Builder(PlayOptions playOptions) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.operation = c2244p5;
            this.trigger = c2244p5;
            this.operation = playOptions.operation();
            this.trigger = playOptions.trigger();
            this.commandOptions = playOptions.commandOptions();
        }
    }
}
