package com.persie.spotifymuter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.NotificationListenerService;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public final class MainActivity extends Activity {
    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int pad = dp(20);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(pad, pad, pad, pad);

        TextView title = new TextView(this);
        title.setText("Spotify Ad Muter");
        title.setTextSize(28f);
        title.setPadding(0, 0, 0, dp(12));
        root.addView(title);

        TextView description = new TextView(this);
        description.setText(
                "Detects Spotify's own MediaSession advertisement marker and temporarily " +
                "sets the phone's music volume to zero. It restores the previous volume " +
                "when normal music returns.\n\nNo Spotify patch, LSPosed, or root hook is required."
        );
        description.setTextSize(16f);
        description.setPadding(0, 0, 0, dp(18));
        root.addView(description);

        status = new TextView(this);
        status.setTextSize(16f);
        status.setPadding(0, 0, 0, dp(18));
        root.addView(status);

        Button access = button("Enable notification access");
        access.setOnClickListener(v ->
                startActivity(new Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)));
        root.addView(access);

        Button reconnect = button("Reconnect detector");
        reconnect.setOnClickListener(v -> {
            NotificationListenerService.requestRebind(
                    new ComponentName(this, SpotifySessionService.class)
            );
            Toast.makeText(this, "Reconnect requested", Toast.LENGTH_SHORT).show();
        });
        root.addView(reconnect);

        Button spotify = button("Open Spotify");
        spotify.setOnClickListener(v -> {
            Intent launch = getPackageManager().getLaunchIntentForPackage(AdDetector.SPOTIFY_PACKAGE);
            if (launch != null) {
                startActivity(launch);
            } else {
                Toast.makeText(this, "Spotify is not installed", Toast.LENGTH_SHORT).show();
            }
        });
        root.addView(spotify);

        Button restore = button("Restore media volume");
        restore.setOnClickListener(v -> {
            VolumeMuter.restore(this);
            updateStatus();
            Toast.makeText(this, "Restore attempted", Toast.LENGTH_SHORT).show();
        });
        root.addView(restore);

        setContentView(root);
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateStatus();
    }

    private void updateStatus() {
        boolean access = hasNotificationAccess();
        boolean muted = VolumeMuter.isMutedByApp(this);

        status.setText(
                "Notification access: " + (access ? "ENABLED" : "DISABLED") +
                "\nMuted by app: " + (muted ? "YES" : "NO") +
                "\n\nRequired: enable notification access once. Then start Spotify normally."
        );
    }

    private boolean hasNotificationAccess() {
        String enabled = Settings.Secure.getString(
                getContentResolver(),
                "enabled_notification_listeners"
        );
        return enabled != null && enabled.contains(getPackageName());
    }

    private Button button(String text) {
        Button button = new Button(this);
        button.setText(text);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0, 0, 0, dp(8));
        button.setLayoutParams(params);
        return button;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
