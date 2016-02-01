package com.wzh.simplemusic.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wzh.simplemusic.R;

/**
 * 音乐播放进度显示模块
 */
public class MusicPlayFragment extends Fragment {


    public MusicPlayFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music_play, container, false);
    }

}
